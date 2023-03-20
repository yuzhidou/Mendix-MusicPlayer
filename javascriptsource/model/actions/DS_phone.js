// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
import "mx-global";
import { Big } from "big.js";

// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * @param {string} lyrics
 * @param {string} name
 * @param {string} musicURL
 * @returns {Promise.<void>}
 */
export async function DS_phone(lyrics, name, musicURL) {
	// BEGIN USER CODE
	let ele =document.getElementById('mymusic');
	ele.innerHTML='';

	let musicArea = document.createElement('div');
	let music = document.createElement('audio');
	music.setAttribute('id', 'myaudio');
	let musicUl = document.createElement('ul');
	let a = 400;//歌词容器到高，随便改,但最好和你自己写到那个div一样高；
	let b = 35;//li的高度，无特殊要求；
	let c = musicURL//歌曲目录，只能放一个哈！
	ele.appendChild(musicArea).appendChild(music);
	musicArea.appendChild(musicUl);
	musicStyle();
	//我让ajax打败了，所以歌词直接放变量了。(╯﹏╰)恶补中；
	//烦人的报错，让我把ajax先扔去喂鱼，等下再吃。
	let lrc = '[ti:]'+name+'\n'+lyrics;
	function musicStyle() {//控件css样式；
		music.autoplay = true;
		music.src = c;
		music.controls = true;
		music.loop = true;
		music.style.outline = 'none';
		music.style.width = '100%';
		music.style.display = 'none';
		musicArea.style.width = '100%';
		musicArea.style.height = '100%';
		musicArea.style.overflow = 'hidden'
		// musicArea.style.outline ='3px solid'
		musicUl.style.listStyle = 'none';
		musicUl.style.width = '100%'
		musicUl.style.padding = '0';
	}
	//把歌词变成[{time,lrc},{time,lrc}...]的样子，不然没法用的
	function split() {//把lrc歌词分割成数组，
		let split_1 = lrc.split('\n');
		let length = split_1.length;
		for (let i = 0; i < length; i++) {
			let lrcArr = split_1[i];
			split_1[i] = change(lrcArr);
			function change(str) {
				let lrc = str.split(']');
				let timer = lrc[0].replace('[', '');
				let str_music = lrc[1];
				let time_split = timer.split(':');
				let s = +time_split[1];
				let min = +time_split[0];
				return {
					time: min * 60 + s,
					lrc: str_music//分割好到歌词和时间
				}

			}
		}
		return split_1
	}
	let lrcArr = split();//至此歌词处理完了。
	createLi();
	function createLi() {//根据歌词数组创建li
		let len = lrcArr.length;
		for (let i = 0; i < len; i++) {
			let lrc_li = lrcArr[i];
			let li = document.createElement('li');
			li.innerText = lrc_li.lrc;
			li.style.height = b + 'px'
			li.style.textAlign = 'center'
			li.style.width = '100%'
			li.style.padding = '0';
			li.style.color = '#999'
			li.style.transition = '0.3s'
			musicUl.appendChild(li);
		}
	}
	function setCurrentLi() {
		let i=0;
		let time = music.currentTime;
		// console.log(time)
		for (i = 0; i < lrcArr.length; i++) {
			let play = lrcArr[i];
			if (time - play.time <= 0) {
				return i;
			}
		} return -1;
	}
	function current() {//设置top，让其滚动
		let li = setCurrentLi();
		let divHeight = a;
		let liHeight = b;
		let top = liHeight * li - divHeight / 2 + liHeight / 2;
		if (top < 0) {
			top = 0;
		}
		musicUl.style.marginTop = -top + 'px';
		// console.log('top'+top);
		let playLi = musicUl.querySelector('.play')
		if (playLi) {
			playLi.className = '';
		}
		if (li >= 0) {
			musicUl.children[li - 1].className = 'play'

		}
	}
	music.ontimeupdate = current;

	// END USER CODE
}